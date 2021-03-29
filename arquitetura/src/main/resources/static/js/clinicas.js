$(document).ready(function () {
	moment.locale('pt-BR');
    var table = $('#table-especializacao').DataTable({
    	searching: true,
    	order: [[ 1, "asc" ]],
    	lengthMenu: [8, 15],
        processing: true,
        serverSide: true,
        responsive: true,
        ajax: {
            url: '/clinicas/datatables/server',
            data: 'data'
        },
        columns: [
            {data: 'id'},
            {data: 'descricao'},
            {data: 'contacto'},
            {data: 'localizacao.descricao'},
            {orderable: false, 
             data: 'id',
                "render": function(id) {
                    return '<a class="btn btn-success btn-sm btn-block" href="/especialidades/editar/'+ 
                    	id +'" role="button"><i class="fas fa-edit"></i></a>';
                }
            },
            {orderable: false,
             data: 'id',
                "render": function(id) {
                    return '<a class="btn btn-danger btn-sm btn-block" href="/especialidades/excluir/'+ 
                    	id +'" role="button" data-toggle="modal" data-target="#confirm-modal"><i class="fas fa-times-circle"></i></a>';
                }               
            }
        ]
    });
});    
