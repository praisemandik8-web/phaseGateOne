const prompt = require("prompt-sync")();
    length = Number(prompt("Enter length "));
    width = Number(prompt("Enter width "));

    area = length * width;
    console.log("Area of the rectangle is: "+ area);
