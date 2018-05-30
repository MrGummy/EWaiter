var company;
var menu;
var category;

$(window).onload(function () {
    document.location.href = "#author";
});

$(document).ready(function() {
    document.getElementById("navigator").style.visibility = "hidden";
});

function clickNavbarMenu() {
    $('.navbar-toggler').on('click', function(event) {
        event.preventDefault();
        $(this).closest('.navbar-minimal').toggleClass('open');
    })
};

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

            company = companies[i];
            document.cookie = "login=" + login + ";path=/";
            document.cookie = "password=" + password + ";path=/";

            // $.ajax({
            //     type: "POST",
            //     url: "http://localhost:8080/view/company.html",
                 //data: {request:companies[i]},
            //     async: true
            // });

            document.location.href = "#company";
            document.getElementById("navigator").style.visibility = "visible";

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

async function allMenuClick() {
    document.location.href = "#menu";

    var controller = new MenuController();
    let html = await controller.getCompanyMenu(JSON.stringify(company.menus));

    var element = document.getElementById("contentContainer");
    element.innerHTML = html;
};

async function oneMenuClick(menuId) {

    for (var i = 0; i < company.menus.length; i++) {
        if (menuId == company.menus[i].id) {
            menu = company.menus[i];
        }
    }

    document.location.href = "#category";

    var controller = new CategoryController();
    let html = await controller.getMenuCategory(JSON.stringify(menu.categories));

    var element = document.getElementById("contentContainer");
    element.innerHTML = html;
}

async function categoryClick(categoryId) {

    for (var i = 0; i < menu.categories.length; i++) {
        if (categoryId == menu.categories[i].id) {
            category = menu.categories[i];
        }
    }

    document.location.href = "#dishes";

    var controller = new DishController();
    let html = await controller.getCategoryDish(JSON.stringify(category.dishes));

    var element = document.getElementById("contentContainer");
    element.innerHTML = html;
}