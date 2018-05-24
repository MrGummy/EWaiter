Template7.registerHelper('link', function (id, name, description, dishes, photo){
    var ret = '<li>' +
        '<p>' + id + '</p>' +
        '<p>' + name + '</p>' +
        '<p>' + description + '</p>' +
        '<ul>' + dishes + '</ul>'
        '<img src="' + photo + '"/>' +
        '</li>';
    return ret;
});