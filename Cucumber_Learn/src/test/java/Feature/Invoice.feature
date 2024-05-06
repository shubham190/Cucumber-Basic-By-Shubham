Feature: Calculate invoice feature

Scenario Outline: Invoice Amount

Given user is on invoice page
When user enter invoice amount "<InvoiceAmount>"
When user enter tax amount "<Taxamount>"
And user click on calculate button
Then user get "<TotalAmount>"

Examples:
|InvoiceAmount|Taxamount|TotalAmount|
|3567         | 123     |3690       |
|1200         |100      |1300       |
