module car.sales {
    exports com.github.wnuq.car.sales.api;
    requires jakarta.persistence;
    requires spring.beans;
    requires spring.web;
    requires spring.context;
    requires spring.data.jpa;
    requires lombok;
}