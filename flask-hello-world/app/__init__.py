from flask import Flask
import os
import socket

app = Flask(__name__)

@app.route("/hello")
def helloworld():
    return "<h1>Hello World from Flask!</h1>"