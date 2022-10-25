$('.show_confirm').click(function(event) {
    console.log("ok");
    let name = $(this).data("name");
    let href = $(this).attr('href');
    event.preventDefault();
    swal({
        title: 'Are you sure you want to delete this record?',
        /*text: "If you delete this, it will be gone forever.",*/
        icon: "warning",
        buttons: true,
        dangerMode: true,
    })
    .then((willDelete) => {
        if (willDelete) {
        	window.location.href = href;
        }
    });
});