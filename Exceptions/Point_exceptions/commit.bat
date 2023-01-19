#!/bin/bash

# Set the starting date for the commits
START_DATE="2023-01-15T12:00:00"

# Number of commits
NUM_COMMITS=100

# Increment in seconds between commits
INCREMENT_SECONDS=86400  # 1 day = 86400 seconds

# Initialize current date
CURRENT_DATE=$(date -d "$START_DATE" +%s)

# Make changes and commit with auto-incrementing date
for ((i=1; i<=$NUM_COMMITS; i++))
do
  # Make changes to your project as needed
  # ...

  # Stage the changes
  git add .

  # Commit with the auto-incrementing date
  COMMIT_DATE=$(date -d "@$CURRENT_DATE" --iso-8601=seconds)
  GIT_COMMITTER_DATE="$COMMIT_DATE" GIT_AUTHOR_DATE="$COMMIT_DATE" git commit -m "Commit $i"

  # Increment the current date for the next commit
  CURRENT_DATE=$((CURRENT_DATE + INCREMENT_SECONDS))
done

# Push to the remote repository if needed
git push origin master
