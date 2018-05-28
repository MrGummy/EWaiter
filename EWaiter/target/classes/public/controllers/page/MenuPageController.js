window.onload = function () {
    getMenuHtml();
}

async function getMenuHtml() {
    var controller = new MenuController();
    let html = await controller.getAllMenuView();

    var element = document.getElementById("menuContainer");
    element.innerHTML = html;
}