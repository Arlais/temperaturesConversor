# Temperature conversor

This program allows you to convert the temperature value from celsius to fahrenheit ir viceversa.

## Getting Started

### Prerequisites

What things you need to install the software and how to install them

```
you will need to have maven and java installed on your computer
```

### Installing


``` 
- First you will need to clone this project from https://github.com/Arlais/temperaturesConversor
- Second you can run the project using any compiler (Recomended IDEA)
- Third, now you have access to all end points, you can check on a browser using the url localhost:4567/Index where you are going to be able to check the landing page
- Now you can use the conversor wothout any problem, you just put the temperature that you want to convert in the field corresponding to the operation that you need to make (from Celsius to Fahrenheit or viceversa)
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

There are 2 test checking that the convertion is correct, we are using testNG in order to test the amount of request that the system can recieve

### To Fahrenheit

First we check the function from Celsius to Fahrenheit

```
We test with 0 Celsius and we are expecting a response of 32 Fahrenheit
```

### To Celsius

After we check the function from Fahrenheit to celsius

```
We test with 32 Fahrenheit and we are expecting a response of 0 Celsius
```

## Deployment

this project can be found in [heroku](https://peaceful-fortress-87075.herokuapp.com/Index)

## Built With

* [Spark](https://sparkjava.com/documentation) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Jonathan Pulido** - *Initial work* - [TemperatureConversor](https://github.com/Arlais/temperaturesConversor)
