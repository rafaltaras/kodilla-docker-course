const express = require("express");
const mongoose = require("mongoose");
const bodyParser = require("body-parser");
const cors = require("cors");

const Todo = require("./models/todo");

const app = express();

// const MONGO_URI = `mongodb://dmin:password@mongo-db:27017/todos-app?authSource=admin`;
// const MONGO_URI = "mongodb://mongo-db:27017/todo-backend-app";
const MONGO_URI = `mongodb://${process.env.MONGO_USERNAME}:${process.env.MONGO_PASSWORD}@mongo-db:27017/todo-backend-app?authSource=admin`;

app.use(bodyParser.json());
app.use(cors());

app.get("/todos", async (req, res) => {
  const todos = await Todo.find();
  return res.status(200).json({
    todos,
  });
});

app.post("/todos", async (req, res) => {
  const name = req.body.name;
  const todo = new Todo({
    name,
  });
  await todo.save();
  res.status(201).json({ message: "Goal saved", todo });
});

app.put("/todos/:id", async (req, res) => {
  const todo = await Todo.findById(req.params.id);

  todo.completed = !todo.completed;

  await todo.save();

  return res.status(201).json({ message: "Todo saved", todo });
});

app.delete("/todos/:id", async (req, res) => {
  await Todo.deleteOne({
    id: req.params.id,
  });

  return res.status(201).json({ message: "Todo deleted" });
});

mongoose.connect(
  MONGO_URI,
  {
    useNewUrlParser: true,
    useUnifiedTopology: true,
  },
  (err) => {
    if (err) {
      console.log("Unable to connect to MongoDB " + MONGO_URI);
      console.log(err);
    } else {
      console.log("Connected to MongoDB");
      app.listen(8000, () => {
        console.log("Now listening on PORT 8000");
      });
    }
  }
);
