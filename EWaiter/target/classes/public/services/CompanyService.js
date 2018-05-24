class CompanyService {

    getAllCompany() {
        return $.ajax({
            type: "GET",
            url: "http://localhost:8080/company/selectAll",
            async: true
        });
    }
}