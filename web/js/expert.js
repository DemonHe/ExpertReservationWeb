// 有关专家信息的后台调用

function createExpert(expert) {
    var check = verifyExpertInfo(expert);
    if (!check.success) {
        return check;
    }

    check = verifyPassword(expert.password, expert.confirm);
    if (!check) {
        return check;
    }

    return {
        success: true,
        message: '成功创建专家信息',
        data: null
    };
}

function deleteExpert(expertId) {
    return {
        success: true,
        message: null,
        data: null
    };
}

function modifyExpert(expert) {
    var check = verifyExpertInfo(expert);
    if (!check.success) {
        return check;
    }

    return {
        success: true,
        message: '成功修改专家信息',
        data: null
    };
}

function searchExpert(name) {
    if (!name || name === '') {
        return {
            success: false,
            message: '输入不能为空',
            data: null
        };
    }

    var list = [];
    for (var i = 0; i < 2; ++i) {
        list.push({
            expertId: i,
            name: i % 2 === 0 ? "张三" : "李四",
            phone: '13200000000',
            email: '123456@gmail.com',
            nationality: '中国',
            title: '教授',
            school: '南京大学',
            specialty: '软件工程',
            description: '软件专家',
            website: 'http://www.baidu.com'
        });
    }

    return {
        success: true,
        message: null,
        data: list
    };
}

function getExpertList() {
    var result = [];
    for (var i = 0; i < 10; ++i) {
        result.push({
            expertId: i,
            name: i % 2 === 0 ? "张三" : "李四",
            phone: '13200000000',
            email: '123456@gmail.com',
            nationality: '中国',
            title: '教授',
            school: '南京大学',
            specialty: '软件工程',
            description: '软件专家',
            website: 'http://www.baidu.com'
        });
    }
    return result
}

function toExpertCreatePage(expertId) {
    var name = $('#' + generateId(expertId, 'name')).text();
    var phone = $('#' + generateId(expertId, 'phone')).text();
    var email = $('#' + generateId(expertId, 'email')).text();
    var nationality = $('#' + generateId(expertId, 'nationality')).text();
    var school = $('#' + generateId(expertId, 'school')).text();
    var specialty = $('#' + generateId(expertId, 'specialty')).text();
    var title = $('#' + generateId(expertId, 'title')).text();
    var website = $('#' + generateId(expertId, 'website')).text();
    var description = $('#' + generateId(expertId, 'description')).text();

    localStorage.setItem('name', name);
    localStorage.setItem('phone', phone);
    localStorage.setItem('email', email);
    localStorage.setItem('nationality', nationality);
    localStorage.setItem('school', school);
    localStorage.setItem('specialty', specialty);
    localStorage.setItem('title', title);
    localStorage.setItem('website', website);
    localStorage.setItem('description', description);

    window.location = '../page/expert-modify.html';
}

function openDeleteDialog(expertId) {
    $('#delete-dialog').modal();
    $('#delete-expert-id').val(expertId);
}

// 有关专家信息的html生成
function generateExpertInfoHtml(expertList) {
    var html = '';
    for (var i = 0; i < expertList.length; ++i) {
        var expert = expertList[i];
        var id = expert.expertId;
        html +=
            '<div class="expert-info" id="' + id + '">' +
                '<div class="expert-header">' +
                    '<span class="name" id="' + generateId(id, 'name') + '">' + expert.name + '</span>' +
                    '<img src="../images/delete.svg" onclick="openDeleteDialog(' + id + ')" title="删除专家信息">' +
                    '<img src="../images/modify.svg" onclick="toExpertCreatePage(' + id + ')" title="修改专家信息">' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/phone.svg" title="电话">' +
                    '<span id="' + generateId(id, 'phone') + '">' + expert.phone + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/email.svg" title="邮箱">' +
                    '<span id="' + generateId(id, 'email') + '">' + expert.email + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/address.svg" title="国籍">' +
                    '<span id="' + generateId(id, 'nationality') + '">' + expert.nationality + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/school.svg" title="学校">' +
                    '<span id="' + generateId(id, 'school') + '">' + expert.school + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/specialty.svg" title="专业">' +
                    '<span id="' + generateId(id, 'specialty') + '">' + expert.specialty + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/title.svg" title="职称">' +
                    '<span id="' + generateId(id, 'title') + '">' + expert.title + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/website.svg" title="网址">' +
                    '<span><a href="' + expert.website + '" id="' + generateId(id, 'website') + '">' + expert.website + '</a></span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/description.svg" title="简介">' +
                    '<span id="' + generateId(id, 'description') + '">' + expert.description + '</span>' +
                '</div>' +
            '</div>';
    }
    return html;
}

function generateId(expertId, attribute) {
    return expertId + '-' + attribute;
}

function verifyExpertInfo(expert) {
    if (!expert.name || expert.name === '') {
        return {
            success: false,
            message: '姓名不能为空',
            data: null
        }
    }

    if (!expert.phone || expert.phone === '') {
        return {
            success: false,
            message: '电话不能为空',
            data: null
        }
    }

    if (!expert.email || expert.email === '') {
        return {
            success: false,
            message: '邮箱不能为空',
            data: null
        }
    }

    if (!expert.nationality || expert.nationality === '') {
        return {
            success: false,
            message: '国籍不能为空',
            data: null
        }
    }

    if (!expert.school || expert.school === '') {
        return {
            success: false,
            message: '学校不能为空',
            data: null
        }
    }

    if (!expert.specialty || expert.specialty === '') {
        return {
            success: false,
            message: '专业不能为空',
            data: null
        }
    }

    if (!expert.title || expert.title === '') {
        return {
            success: false,
            message: '职称不能为空',
            data: null
        }
    }

    if (!expert.website || expert.website === '') {
        return {
            success: false,
            message: '介绍网址不能为空',
            data: null
        }
    }

    if (!expert.description || expert.description === '') {
        return {
            success: false,
            message: '简介不能为空',
            data: null
        }
    }

    return {
        success: true,
        message: null,
        data: null
    };
}

function verifyPassword(password, confirm) {
    if (!password || password === '') {
        return {
            success: false,
            message: '密码不能为空',
            data: null
        }
    }

    if (password !== confirm) {
        return {
            success: false,
            message: '密码和密码确认不一致',
            data: null
        }
    }

    return {
        success: true,
        message: null,
        data: null
    };
}