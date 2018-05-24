class CategoryService {

    getAllCategory() {
        $.ajax({
            type: "GET",
            url: "http://localhost:8080/category/selectAll",
            success: function (response) {
                var categories = JSON.parse(response);
                return categories;
            }
        });
    }
}