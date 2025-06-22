
//alert("hello abhinav");
// var arr=[1,2,3,4,5];
// arr.forEach(function(val){
//     console.log(val+ " heeeelo")
// })

//var arr=[1,2,3,4,5];
// var newarr= arr.map(function(val){
// return val;
// })
// console.log(newarr);

// const fs=require('fs');
// // fs.writeFile("Hey.text","hello abhinav",function(err){
//     fs.rm("/Users/abhinavkriti/Desktop/code/nodejs/Hey",function(err){
//         if(err) console.error(err);
//     else console.log("done");
// }
// )


const http=require('http');

const server= http.createServer(function(req,res){
    res.end("hello world");

})
server.listen(3000);
