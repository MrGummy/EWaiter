class MenuController {
    constructor() {
        this.templateMenu = new TemplateMenu();
        this.menuService = new MenuService();
    }

    getTemlateMenu() {
        return this.templateMenu.templ();
    }

    insertMenu(json) {
        return this.menuService.insertMenu(json);
    }

    getCompanyMenu(json) {
        var menus = JSON.parse(json);

        var template = this.getTemlateMenu();
        var compiledTemplate = Template7.compile(template);
        var context = {menus: menus};
        var html = compiledTemplate(context);

        return html;
    }

    insertMenuView() {
        var photo = "/images/plus.png";
        var name = document.getElementById("nameMenu").value;
        var description = document.getElementById("descriptionMenu").value;
        var date = document.getElementById("dateMenu").value;

        var object = {};

        object.id = 0;
        object.name = name;
        object.description = description;
        object.date = date;
        object.photo = photo;

        var json = JSON.stringify(object);

        var count = this.insertMenu(json);
    }
}