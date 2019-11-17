Here.com access information
_______

App+ID: pRx2iZs3UW7YAjlvsdCJ

Key: l6QfiFZpUmxv8qthYmXYlw

Sample Requests/Responses:

https://nominatim.openstreetmap.org/search?format=json&q=1600+vine+street,+hollywood,+california

`
[
    {
        "place_id": 19548580,
        "licence": "Data © OpenStreetMap contributors, ODbL 1.0. https://osm.org/copyright",
        "osm_type": "node",
        "osm_id": 1902175919,
        "boundingbox": [
            "34.0999666",
            "34.1000666",
            "-118.3265162",
            "-118.3264162"
        ],
        "lat": "34.1000166",
        "lon": "-118.3264662",
        "display_name": "Trader Joe's, 1600, Vine Street, Whitley Heights Historic District, Hollywood, Los Angeles, Los Angeles County, California, 90028, United States of America",
        "class": "shop",
        "type": "supermarket",
        "importance": 0.511,
        "icon": "https://nominatim.openstreetmap.org/images/mapicons/shopping_supermarket.p.20.png"
    }
]
`

https://weather.api.here.com/weather/1.0/report.json?app_id=pRx2iZs3UW7YAjlvsdCJ&app_code=l6QfiFZpUmxv8qthYmXYlw&product=observation&name=Berlin
`
{
  "feedCreation": "2019-11-17T23:56:40.345Z",
  "metric": true,
  "observations": {
    "location": [
      {
        "city": "Land Berlin",
        "country": "Germany",
        "distance": 0.00,
        "latitude": 52.5,
        "longitude": 13.41667,
        "observation": [
          {
            "activeAlerts": "0",
            "ageMinutes": "36",
            "airDescription": "",
            "airInfo": "*",
            "barometerPressure": "1005.08",
            "barometerTrend": "",
            "city": "Land Berlin",
            "comfort": "7.57",
            "country": "Germany",
            "daylight": "N",
            "description": "Passing clouds. Cool.",
            "dewPoint": "8.00",
            "distance": 10.23,
            "elevation": 0.00,
            "highTemperature": "11.70",
            "humidity": "94",
            "icon": "14",
            "iconLink": "https://weather.api.here.com/static/weather/icon/23.png",
            "iconName": "night_mostly_clear",
            "latitude": 52.5000,
            "longitude": 13.4167,
            "lowTemperature": "5.00",
            "precipitation12H": "*",
            "precipitation1H": "*",
            "precipitation24H": "*",
            "precipitation3H": "*",
            "precipitation6H": "*",
            "precipitationDesc": "",
            "skyDescription": "Passing clouds",
            "skyInfo": "7",
            "snowCover": "*",
            "state": "Berlin",
            "temperature": "9.00",
            "temperatureDesc": "Cool",
            "utcTime": "2019-11-18T00:20:00.000+01:00",
            "visibility": "*",
            "windDesc": "East",
            "windDescShort": "E",
            "windDirection": "80",
            "windSpeed": "9.27"
          }
        ],
        "state": "Berlin",
        "timezone": 1
      },
      {
        "city": "Berlin-Schoenefeld",
        "country": "Germany",
        "distance": 14.78,
        "latitude": 52.38,
        "longitude": 13.51,
        "observation": [
          {
            "activeAlerts": "0",
            "ageMinutes": "36",
            "airDescription": "",
            "airInfo": "*",
            "barometerPressure": "1005.08",
            "barometerTrend": "",
            "city": "Berlin-Schoenefeld",
            "comfort": "6.27",
            "country": "Germany",
            "daylight": "N",
            "description": "Clear. Cool.",
            "dewPoint": "8.00",
            "distance": 14.78,
            "elevation": 46.00,
            "highTemperature": "*",
            "humidity": "94",
            "icon": "13",
            "iconLink": "https://weather.api.here.com/static/weather/icon/16.png",
            "iconName": "night_clear",
            "latitude": 52.3800,
            "longitude": 13.5100,
            "lowTemperature": "*",
            "precipitation12H": "*",
            "precipitation1H": "*",
            "precipitation24H": "*",
            "precipitation3H": "*",
            "precipitation6H": "*",
            "precipitationDesc": "",
            "skyDescription": "Clear",
            "skyInfo": "2",
            "snowCover": "*",
            "state": "Brandenburg",
            "temperature": "9.00",
            "temperatureDesc": "Cool",
            "utcTime": "2019-11-18T00:20:00.000+01:00",
            "visibility": "16.09",
            "windDesc": "East",
            "windDescShort": "E",
            "windDirection": "90",
            "windSpeed": "18.53"
          }
        ],
        "state": "Brandenburg",
        "timezone": 1
      }
    ]
  }
}
`
