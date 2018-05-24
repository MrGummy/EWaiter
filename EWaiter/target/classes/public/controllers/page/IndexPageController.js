async function loginClick()
{
    var controller = new CompanyController();
    let response = await controller.getAllCompanyList();
    var companies = JSON.parse(response);

    var login = document.getElementById("login").value;
    var password = document.getElementById("password").value;

    for (var i = 0; i < companies.length; i++) {
        if (login == companies[i].login && password == companies[i].password)
        {
            //document.getElementById("modalWindow").click();

            document.cookie = "login=" + login + ";path=/";
            document.cookie = "password=" + password + ";path=/";

            document.location.href = "view/company.html/";
            return;
        }
    }

    if((login=="")||(password=="")) {
        alert("Введите логин и пароль!");
    }
    else {
        alert("Вход не выполнен. Проверьте введенные данные!");
    }
}