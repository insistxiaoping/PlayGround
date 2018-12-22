//Ä£ÄâºóÌ¨
Mock.mock('http://localhost:8086/editEquip', function () {
    var obj = {result:"success"};
    return obj;
});

Mock.mock('http://localhost:8086/addEquip', function () {
    var obj = {result:"success"};
    return obj;
});
Mock.mock('http://localhost:8086/equipMsg', function () {
    var obj = {result:"success"};
    return obj;
});
Mock.mock('http://localhost:8086/equipList', {'equipList|1-10': [{
        'equipId|+1': 1,
        'equipName': '@first @middle @last',
        'equipTotal|1-10': 10,
        'equipRest|1-10': 5,
        'equipConst': 10,
        'equipMetho': '±à¼­',
    }]
});
Mock.mock('http://localhost/user/applyData', {'applyList|1-10': [{
        'equipId|+1': 1,
        'equipName': '@first @middle @last',
        'equipTotal|1-10': 10,
        'equipRest|1-10': 5,
        'equipConst': 10,
        'equipMetho': '±à¼­',
    }]
});
Mock.mock('http://localhost/user/applyData', {
        'applyList|1-10': [{
            'applyId': '@first',
            'applyUserId': '@first',
            'applyEquipId': 'xxx',
            'applyNum|1-10': 2,
            'applyDate': '@date',
            'startTime': '@time',
            'endTime':  '@time',
            'applyPay|+10': 10,
            'applyPaid': 0,
        }],
        'equipList|1-10': [{
            'equipName': '@first',
            'equipId': 'xxx',
        }]
    }
);
var Random = Mock.Random
var date = Random.date('yyyy-MM-dd');
var time = Random.time('A HH:00:00');