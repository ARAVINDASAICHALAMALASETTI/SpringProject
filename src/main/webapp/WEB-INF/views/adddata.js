function displayDetails(){
	var id = document.getElementById("enterid").value;
    var name = document.getElementById("name").value;
    var gen = document.getElementById("gender").value;
    var born = document.getElementById("born").value;
    var bornl = document.getElementById("loc").value;
    var bookt = document.getElementById("theme").value;
    var bcount = document.getElementById("count").value;
    var lbook = document.getElementById("ldate").value;
	
	if(id == ""){
        alert("please enter id number");
        return;
    }
    if(name == ""){
        alert("please enter name");
        return;
    }
    if(gen == ""){
        alert("please enter gender");
        return;
    }
    if(born == ""){
        alert("please enter born date");
        return;
    }
    if(bornl == ""){
        alert("please enter born location details");
        return;
    }
    if(bookt == ""){
        alert("please enter book count");
        return;
    }
    if(bcount == ""){
        alert("please enter book count");
        return;
    }
    if(lbook == ""){
        alert("please enter last book publish date");
        return;
    }

    var table = document.getElementById("display");
    var tr = table.insertRow(table.length);
    t1 = tr.insertCell(0);
    t2 = tr.insertCell(1);
    t3 = tr.insertCell(2);
    t4 = tr.insertCell(3);
    t5 = tr.insertCell(4);
    t6 = tr.insertCell(5);
    t7 = tr.insertCell(6);
    t8 = tr.insertCell(7);
    t9 = tr.insertCell(8);

    t1.innerHTML = id;
    t2.innerHTML = name;
    t3.innerHTML = gen;
    t4.innerHTML = born;
    t5.innerHTML = bornl;
    t6.innerHTML = bookt;
    t7.innerHTML = bcount;
    t8.innerHTML = lbook;
    t9.innerHTML = `<i class="far fa-edit del-icon"></i>,<i class="far fa-trash-alt" onClick = 'onDelete(this)'></i>`

}

function onDelete(td){
    if(confirm('Do you want to delete this record?')){
        row = td.parentElement.parentElement;
        document.getElementById("display").deleteRow(row.rowIndex);
    }
    resetForm();
}

function resetForm(){
	document.getElementById('enterid').value = "";
    document.getElementById('name').value = "";
    document.getElementById('gender').value = "";
    document.getElementById('born').value = "";
    document.getElementById('loc').value = "";
    document.getElementById('theme').value = "";
    document.getElementById('count').value = "";
    document.getElementById('ldate').value = "";

}