class CategoryTemplate {

    templ() {
        var template = '{{#each categories}}' +
            '<a class="animate" onclick="categoryClick({{id}})">' +
            '<div class="row categoryContent">' +
            '<div class="categoryLabel">' +
            '<label>{{name}}</label>' +
            '</div>' +
            '<img class="categoryImg" src="{{photo}}"/>' +
            '</div>' +
            '</a>' +
            '{{/each}}';

        return template;
    }
}

