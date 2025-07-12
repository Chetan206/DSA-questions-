let newPromise = new Promise((resolve, reject) => {
    console.log("hello");
    reject(new Error("internal Server Error"));
});