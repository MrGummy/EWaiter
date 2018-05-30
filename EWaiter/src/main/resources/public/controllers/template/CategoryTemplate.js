class CategoryTemplate {

    templ() {
        var template = '{{#each categories}}' +
            '<a class="animate" onclick="categoryClick({{id}})">' +
            '<div class="row categoryContent">' +
            '<img class="categoryImg" src="{{photo}}"/>' +
            '<div class="categoryLabel">' +
            '<label>{{name}}</label>' +
            '</div>' +
            '</div>' +
            '</a>' +
            '{{/each}}';

        return template;
    }
}

