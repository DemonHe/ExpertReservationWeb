// 验证用户输入

function verifyServiceValue(service) {
    if (!service.title || service.title === '') {
        return {
            success: false,
            message: '标题不能为空',
            data: null
        };
    }

    if (!service.address || service.address === '') {
        return {
            success: false,
            message: '地址不能为空',
            data: null
        };
    }

    if (!service.time || service.time === '') {
        return {
            success: false,
            message: '预约时间不能为空',
            data: null
        };
    }

    if (!service.deadline || service.deadline === '') {
        return {
            success: false,
            message: '截止时间不能为空',
            data: null
        };
    }

    if (!service.serviceType || service.serviceType === '') {
        return {
            success: false,
            message: '服务类型不能为空',
            data: null
        };
    }

    if (!service.professionType || service.professionType === '') {
        return {
            success: false,
            message: '专业类型不能为空',
            data: null
        };
    }

    if (!service.description || service.description === '') {
        return {
            success: false,
            message: '正文不能为空',
            data: null
        };
    }

    return {
        success: true,
        message: '创建服务成功',
        data: null
    };
}