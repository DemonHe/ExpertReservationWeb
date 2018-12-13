// 有关账户信息的后台调用

function login(name, password) {
    if (!name || name === "") {
        return {
            success: false,
            message: "姓名不能为空",
            data: null
        };
    }

    if (!password || password === "") {
        return {
            success: false,
            message: "密码不能为空",
            data: null
        };
    }

    return {
        success: true,
        message: null,
        data: 'MANAGER'
    };
}

function logout() {

}