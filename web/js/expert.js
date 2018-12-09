// 有关专家信息的后台调用

function createExpert(expert) {

}

function deleteExpert(expertId) {

}

function modifyExpert(expert) {

}

function searchExpert(name) {

}

function getExpertList() {
    var result = [];
    for (var i = 0; i < 10; ++i) {
        result.push({
            expertId: i,
            name: "张三",
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

// 有关专家信息的html生成
function generateExpertInfoHtml(expertList) {
    var html = '';
    for (var i = 0; i < expertList.length; ++i) {
        var expert = expertList[i];
        html +=
            '<div class="expert-info" id="' + expert.expertId + '">' +
                '<div class="expert-header">' +
                    '<span class="name">' + expert.name + '</span>' +
                    '<img src="../images/delete.svg" title="删除专家信息">' +
                    '<img src="../images/modify.svg" title="修改专家信息">' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/phone.svg" title="电话">' +
                    '<span>' + expert.phone + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/email.svg" title="邮箱">' +
                    '<span>' + expert.email + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/address.svg" title="国籍">' +
                    '<span>' + expert.nationality + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/school.svg" title="学校">' +
                    '<span>' + expert.school + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/specialty.svg" title="专业">' +
                    '<span>' + expert.specialty + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/title.svg" title="职称">' +
                    '<span>' + expert.title + '</span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/website.svg" title="网址">' +
                    '<span><a href="' + expert.website + '">' + expert.website + '</a></span>' +
                '</div>' +
                '<div class="item">' +
                    '<img src="../images/description.svg" title="简介">' +
                    '<span>' + expert.description + '</span>' +
                '</div>' +
            '</div>';
    }
    return html;
}