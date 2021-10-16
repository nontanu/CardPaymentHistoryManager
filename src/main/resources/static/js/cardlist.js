$(function() {
    $.ajax(
      {
        type: 'get',
        url: $('#root_url').val() + 'card/list',
        dataType: 'json'
      }
    )
    .done(function(res) {
      $.each(res, function(index, val) {
        $('#card_list').append(
          $('<li></li>').append(
            $('<a></a>')
              .attr({
                href: $('#root_url').val() + val.id,
                target: '_blank'
              })
              .text(val.name)
          )
        );
      });
    })
    .fail(function() {
      window.alert('サーバーとの通信に失敗しました。');
    })
    .always(function() {
	    addRegistLink();
    });

    var addRegistLink = function() {
	    $('#card_list').append(
          $('<li></li>').append(
            $('<a></a>')
              .attr({
                href: $('#root_url').val() + 'card/registration',
                target: '_blank'
              })
              .text("カードを登録する")
          )
        );
    }

});