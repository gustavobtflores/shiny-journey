function wait(cb, time) {
  setTimeout(() => {
    if (cb) cb();
  }, time);
}

function cbcall() {
  console.log("callback called");
}

wait(cbcall, 1000);
