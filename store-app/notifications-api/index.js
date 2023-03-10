const express = require("express");
const amqp = require("amqplib");

const app = express();

async function connect() {
  try {
    const connection = await amqp.connect(
        `amqp://${process.env.RABBITMQ_HOST}:${process.env.RABBITMQ_PORT}`
    );
    const queueName = `${process.env.RABBITMQ_QUEUE_NAME}`;
    const channel = await connection.createChannel();
    channel.assertQueue(queueName);
    channel.consume(queueName, (message) => {
      console.log({ message: message.content.toString() });
      channel.ack(message);
    });
  } catch (error) {
    console.log({ error });
  }
}

connect();

app.listen(5001, () => {
  console.log("Listening on PORT 5001");
});
