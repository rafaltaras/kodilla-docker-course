const express = require("express");
const app = express();
const port = 3000;

app.get("/hello", (req, res) => {
    res.send("Hello World from Node Application");
});

app.listen(port, () => {
   console.log("Running on port " + port);
});

