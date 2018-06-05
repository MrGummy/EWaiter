class CompanyService {

    getAllCompany() {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/company/selectAll",
            async: true
        });
    }

    getCompanyById(id) {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/company/selectById/" + id + "",
            async: true
        });
    }

    insertCompany(json) {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/insertCompany/" + json + "",
            async: true
        });
    }

    updateCompany(json) {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/updateCompany/" + json + "",
            async: true
        });
    }

    deleteCompany(id) {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/deleteById/" + id + "",
            async: true
        });
    }
}