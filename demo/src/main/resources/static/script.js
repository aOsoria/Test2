function calculateCompoundInterest() {
    var principal = parseFloat(document.getElementById("initial-investment").value);
    var contribution = parseFloat(document.getElementById("annual-contribution").value);
    var contributionIncrease = parseFloat(document.getElementById("annual-contribution-increase").value);
    var years = parseInt(document.getElementById("investment-years").value);
    var returnRate = parseFloat(document.getElementById("investment-return").value);

    var request = {
        initialInvestment: principal,
        annualContribution: contribution,
        annualContributionIncrease: contributionIncrease,
        investmentYears: years,
        investmentReturn: returnRate
    };

    $.ajax({
        url: "/calculate",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(request),
        success: function (data) {
            document.getElementById("result").innerHTML = data;
        },
        error: function (xhr, status, error) {
            document.getElementById("result").innerHTML = xhr.responseText;
        }
    });
}

document.getElementById("calculate-btn").addEventListener("click", calculateCompoundInterest);
