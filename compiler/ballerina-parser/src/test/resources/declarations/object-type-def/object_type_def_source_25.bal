type foo service object {

    resource Person person;

    resource function get person() returns Person {
        return { firstName: "Lochana", lastName: "Jayawickrama" };
    }
};
