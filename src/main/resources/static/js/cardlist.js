$(function() {
    // .phpファイルへのアクセス
    $.ajax(
      {
        type: 'get',
        url: location.href + '/list',
        dataType: 'json'
      }
    )
    // 検索成功時にはページに結果を反映
    .done(function(res) {
      $.each(res, function(index, val) {
        $('#card_list').append(
          $('<li></li>').append(
            $('<a></a>')
              .attr({
                href: location.href + '/' + val.id,
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
                href: location.href + '/cardregist',
                target: '_blank'
              })
              .text("カードを登録する")
          )
        );
    }

});