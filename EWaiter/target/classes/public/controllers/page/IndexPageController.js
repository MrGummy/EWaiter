var company;
var menu;
var category;

$(window).load(function () {
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

function allMenuClick(){
    document.location.href = "#menu";

    var controller = new MenuController();
    var html = controller.getCompanyMenu(JSON.stringify(company.menus));

    var element = document.getElementById("menuContainer");
    element.innerHTML = html;
}

function addMenuImgClick(e) {

    if (this.files && this.files[0]) {
        var reader = new FileReader();
        $(reader).load(function(e) {
            $('#upload-img').attr('src', e.target.result);
        });
        reader.readAsDataURL(this.files[0]);
    }

    // $("#upload").change(readURL);
    //
    // var img = document.getElementById("addMenuImg");
    // img.setAttribute("src", "адрес_картинки");
    // document.body.appendChild(img);
}

function applyMenu() {
    
    var controller = new MenuController();
    var count = controller.insertMenuView();

    alert(count);
}

function oneMenuClick(menuId) {

    for (var i = 0; i < company.menus.length; i++) {
        if (menuId == company.menus[i].id) {
            menu = company.menus[i];
        }
    }

    document.location.href = "#category";

    var controller = new CategoryController();
    var html = controller.getMenuCategory(JSON.stringify(menu.categories));

    var element = document.getElementById("categoryContainer");
    element.innerHTML = html;
}

function categoryClick(categoryId) {

    for (var i = 0; i < menu.categories.length; i++) {
        if (categoryId == menu.categories[i].id) {
            category = menu.categories[i];
        }
    }

    document.location.href = "#dishes";

    var controller = new DishController();
    var html = controller.getCategoryDish(JSON.stringify(category.dishes));

    var element = document.getElementById("dishesContainer");
    element.innerHTML = html;
}