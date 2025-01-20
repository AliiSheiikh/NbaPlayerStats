import requests
import pandas as pd

# URL to scrape
url = "https://stats.nba.com/stats/leagueLeaders"
params = {
    "ActiveFlag": "No",
    "LeagueID": "00",
    "PerMode": "Totals",
    "Scope": "S",
    "Season": "All Time",
    "SeasonType": "Regular Season",
    "StatCategory": "PTS"
}

# Headers to mimic a browser request
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/114.0.5735.199 Safari/537.36",
    "Referer": "https://www.nba.com",
    "Origin": "https://www.nba.com"
}

# Make the request
response = requests.get(url, headers=headers, params=params)
response.raise_for_status()  # Raise error for bad status codes

# Parse the JSON response
data = response.json()
headers = data["resultSet"]["headers"]  # Column names
rows = data["resultSet"]["rowSet"]     # Data rows

# Convert to DataFrame
df = pd.DataFrame(rows, columns=headers)

 # Save to CSV
output_file = "nba_league_leaders.csv"
df.to_csv(output_file, index=False)
print(f"Data saved to {output_file}")

