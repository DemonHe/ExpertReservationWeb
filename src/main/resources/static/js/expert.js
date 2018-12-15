
function toExpertModifyPage(expertId) {
    var name = $('#' + generateId(expertId, 'name')).text();
    var phone = $('#' + generateId(expertId, 'phone')).text();
    var email = $('#' + generateId(expertId, 'email')).text();
    var nationality = $('#' + generateId(expertId, 'nationality')).text();
    var school = $('#' + generateId(expertId, 'school')).text();
    var specialty = $('#' + generateId(expertId, 'specialty')).text();
    var title = $('#' + generateId(expertId, 'title')).text();
    var description = $('#' + generateId(expertId, 'description')).text();

    localStorage.setItem('id', expertId);
    localStorage.setItem('name', name);
    localStorage.setItem('phone', phone);
    localStorage.setItem('email', email);
    localStorage.setItem('nationality', nationality);
    localStorage.setItem('school', school);
    localStorage.setItem('specialty', specialty);
    localStorage.setItem('title', title);
    localStorage.setItem('description', description);

    window.location = '/static/expert/modify';
}

function toServiceCreatePage(expertName) {
    localStorage.setItem("expertName", expertName);
    window.location = '/static/service/create';
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
        var id = expert.id;
        html +=
            '<div class="expert-info" id="' + id + '">' +
                '<div class="expert-header">' +
                    '<span class="name" id="' + generateId(id, 'name') + '">' + expert.name + '</span>' +
                    '<img src="images/delete.svg" onclick="openDeleteDialog(' + id + ')" title="删除专家信息">' +
                    '<img src="images/modify.svg" onclick="toExpertModifyPage(' + id + ')" title="修改专家信息">' +
                    '<img src="images/add.svg" onclick="toServiceCreatePage(\'' + expert.name + '\')" title="创建服务信息">' +
                '</div>' +
                '<div class="item">' +
                    '<img src="images/phone.svg" title="电话">' +
                    '<span id="' + generateId(id, 'phone') + '">' + expert.phoneNum + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="images/email.svg" title="邮箱">' +
                    '<span id="' + generateId(id, 'email') + '">' + expert.email + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="images/address.svg" title="国籍">' +
                    '<span id="' + generateId(id, 'nationality') + '">' + expert.nationality + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="images/school.svg" title="学校">' +
                    '<span id="' + generateId(id, 'school') + '">' + expert.school + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="images/specialty.svg" title="专业">' +
                    '<span id="' + generateId(id, 'specialty') + '">' + expert.specialty + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="images/title.svg" title="职称">' +
                    '<span id="' + generateId(id, 'title') + '">' + expert.position + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="images/description.svg" title="简介">' +
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

    if (!expert.phoneNum || expert.phoneNum === '') {
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

    if (!expert.position || expert.position === '') {
        return {
            success: false,
            message: '职称不能为空',
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
