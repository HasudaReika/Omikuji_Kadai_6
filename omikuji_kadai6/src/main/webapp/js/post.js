/**
 * Ajaxを使用して郵便番号と住所の相互補完
 */
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>


/**
 * 郵便番号が7桁入力されたら住所を補完
 */
$(function() {
	//文書が読み込まれたタイミングで実行
	$('#postCode').on('keyup', function() {
		var numLength = $(this).val();
		//数字が7桁入力された場合に実行
		if (/^\d{7}$/.test(numLength)) {
			//入力された郵便番号を取得
			var postCode = $("#postCode").val();
			//AjaxでPostAcionのsearchAddress()を呼び出す
			$.ajax({
				url: '/omikuji6/action/PostAction/searchAddress',
				dataType: 'json',
				data: { postCode: postCode },
				type: 'Get',
				success: function(response) {
					//ドロップダウン
					var $dropdown = $('#dropdown');
					//既存の項目をクリア
					$dropdown.empty(); 
					
					//取得した住所が空や存在しない場合
					if (response === null || response === undefined || response === "") {
						//住所がなかった場合の処理
						alert('該当する住所がありません。')
						//ドロップダウンを非表示
						$('#dropdown').hide();
					} else if (response.length === 1) {
						//住所が一件ヒットした場合は自動補完
						$('#address').val(response[0]);
						//ドロップダウンを非表示
						$('#dropdown').hide();
					} else if (response.length >= 2) {
						//住所が複数ヒットした場合ドロップダウンに候補を追加
						response.forEach(function(address) {
						$dropdown.append('<div>' + address + '</div>')
						});
						//ドロップダウンを表示
						$dropdown.show();
						//クリックされた候補を住所欄に補完
						$('#address').val(address);
						//補完したらドロップダウンを非表示
						$dropdown.hide();
					}
				},
				error:function(){
					alert('住所の取得に失敗しました。')
				}
			});

		}
	});
});