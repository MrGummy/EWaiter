class CategoryController {
    constructor() {
        this.categoryService = new CategoryService();
        this.categoryTemplate = new CategoryTemplate();
    }

    getTemplateCategory () {
        return this.categoryTemplate.templ();
    }

    getMenuCategory(json) {
        var categories = JSON.parse(json);

        var template = this.getTemplateCategory();
        var compiledTemplate = Template7.compile(template);
        var context ={categories : categories};
        var html = compiledTemplate(context);

        return html;
    }
}