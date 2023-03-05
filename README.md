# Root Raiser
Root Raiser is a mobile app that connects consumers with farmers and tracks where the ROOT of their products comes from! Consumers can discover local farmers and buy their products straight from their hands. App functionality includes:
- Farmers can upload and sell their products
* Consumers can buy and review products
+ A map showing where the product was grown

## Build Instructions
After cloning the remote repository to your local device, copy the following commands to the terminal:

1. Check if all necessary information is available.

```bash
mvn validate
```
2. Compile the source code.
```bash
mvn compile
```
3. Create the JAR package
```bash
mvn package
```

## Running the App

From the base directory, go into the target directory.
```bash
cd target
```
Run the JAR file to play the game.
```bash
java -cp RootApplication-1.0-SNAPSHOT.jar main.Main
```

## Built With

- React.js [Frontend]
- mySQL [Database]
- Maven [Project Management]
- Java -> SpringBoot [Backend]

## Screenshots
![Buyer Menu](https://media.discordapp.net/attachments/1081624620769234985/1081740936129814598/Screenshot_2023-03-04_at_4.45.13_PM.png?width=2340&height=1325)
![Product Page](https://media.discordapp.net/attachments/1081624620769234985/1081740936415023154/Screenshot_2023-03-04_at_4.45.47_PM.png?width=2360&height=1325)
