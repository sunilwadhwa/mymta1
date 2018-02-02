# Simple python Flask app

from flask import Flask
import os

app = Flask(__name__)

# Get port from environment variable or choose 9099 as local default
port = int(os.getenv("PORT", 9099))

@app.route('/')
def hello_world():
    return '<html><body> <h1>Hello World!</h1> <p>This is python module pymodule1.</p> </body></html>'

if __name__ == '__main__':
    # Run the app, listening on all IPs with our chosen port number
    app.run(host='0.0.0.0', port=port)
