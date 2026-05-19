const prompt = require("prompt-sync")();
    price = Number(prompt("Enter price "));
    tax = 0.1*price;
    taxPrice = price - tax;        

     console.log("Tax amount is "+ tax);
     console.log("Price after tax deductions is  "+ taxPrice);
        
