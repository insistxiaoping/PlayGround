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