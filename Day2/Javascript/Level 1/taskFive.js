const prompt = require("prompt-sync")();
    c = Number(prompt("Enter temperature in degree celcius "));
    f = (c*1.8) + 32;
    console.log("Temperature in Fahrenheit is "+ f)
