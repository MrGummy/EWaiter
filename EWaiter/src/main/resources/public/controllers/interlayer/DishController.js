class DishController {
    constructor() {
        this.dishTemplate = new DishTemplate();
    }

    getTemplateDish() {
        return this.dishTemplate.templ();
    }

    getCategoryDish(json) {
        var dishes = JSON.parse(json);

        var template = this.getTemplateDish();
        var compiledTemplate = Template7.compile(template);
        var context ={dishes : dishes};
        var html = compiledTemplate(context);

        return html;
    }
}