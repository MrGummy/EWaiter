class MenuController {
    constructor() {
        this.templateMenu = new TemplateMenu();
    }

    getTemlateMenu() {
        return this.templateMenu.templ();
    }

    async getCompanyMenu(json) {
        var menus = JSON.parse(json);

        var template = this.getTemlateMenu();
        var compiledTemplate = Template7.compile(template);
        var context = {menus: menus};
        var html = compiledTemplate(context);

        return html;
    }
}