function main() {
	let a;
	console.log(a, typeof a);
	a= 10;
	console.log(a, typeof a);
	a = "20";
	console.log(a, typeof a);
	a = Number(a);
	console.log(a, typeof a);
	a = "hari"
	console.log(a, typeof a);
	a = Number(a);
	console.log(a, typeof a);
	a = true;
	console.log(a, typeof a);
	a = Number(a);
	console.log(a, typeof a);
	a = String(a);
	console.log(a, typeof a);
	a = 10.5;
	console.log(a, typeof a);

	let b = null;
	console.log(b, typeof b);
	let d = "hari";
	let e = 10;
	let res = d+e;
	console.log(res, typeof res);

	console.log(Boolean(0));
	console.log(Boolean(""));
	console.log(Boolean(NaN));
	console.log(Boolean(null));
	console.log(Boolean(undefined));

	console.log(Boolean("hari"));
	console.log(Boolean("123"));


	// let c = prompt("Enter a number");
	// console.log(c);
}
main();