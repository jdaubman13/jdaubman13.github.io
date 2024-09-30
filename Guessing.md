# Number Guessing
## Flowchart
```mermaid
flowchart TD
A[Start] --> B[Generate Number 1-10]
B --> C{Asks user to guess the number}
C -->|One| D[Correct Number]
C -->|Two| E[Wrong Number]
C -->|Three| F[Not Numeric]
E --> |One| G[Too High]
E --> |One| H[Too Low]
```
## Documentation 
###### The Program is started and a number is generated. The user is asked to guess a number. Show the user if the input is correct, incorect, or invalid. If incorrect it shows if its too high or too low. 
