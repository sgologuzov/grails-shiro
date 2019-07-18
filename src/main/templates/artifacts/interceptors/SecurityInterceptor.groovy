package ${packageName}

/**
 * Generated by the Shiro plugin. This interceptor class protects all URLs
 * via access control by convention.
 */
class ${className} {

    //customize me
    int order = HIGHEST_PRECEDENCE+100

    boolean before() {
        // Access control by convention.
        accessControl()
    }
    void afterView() {
    }
}
