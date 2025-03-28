from flask import Flask, request, jsonify
from flask_cors import CORS  # Import CORS
import pickle
import pandas as pd

app = Flask(__name__)
CORS(app)  # Enable CORS

# Load trained model
with open("rent_model.pkl", "rb") as file:
    model = pickle.load(file)

# Define expected features
features = ["BHK", "Size", "Floor", "Bathroom", "Area Type", "Area Locality", "City", "Furnishing Status", "Tenant Preferred"]

@app.route("/predict", methods=["POST"])
def predict():
    try:
        data = request.json  # Get JSON data from frontend
        input_df = pd.DataFrame([data], columns=features)

        # Predict rent
        predicted_rent = model.predict(input_df)[0]
        return jsonify({"predicted_rent": round(predicted_rent, 2)})

    except Exception as e:
        return jsonify({"error": str(e)})

if __name__ == "__main__":
    app.run(debug=True, host="0.0.0.0", port=5000)  # Make it accessible
