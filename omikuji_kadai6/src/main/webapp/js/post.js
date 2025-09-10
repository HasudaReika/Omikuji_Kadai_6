/**
 * Ajaxを使用して郵便番号と住所の相互補完
 */


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
				url: '/omikuji_kadai6/post/searchAddress',
				dataType: 'json',
				data: { postCode: postCode },
				type: 'GET',
				success: function(response) {
					//ドロップダウン
					var $dropdown = $('#dropdown');
					//既存の項目をクリア
					$dropdown.empty();

					//取得した住所が空や存在しない場合
					if (response == null || response == undefined || response == "" || response.length == 0) {
						//住所がなかった場合の処理
						alert('該当する住所がありません。');
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
							var $item = $('<div class="dropdown-item"></div>').text(address);
							$dropdown.append($item);
							//クリックされた候補を住所欄に補完
							$item.on('click', function() {
								$('#address').val(address);
								//補完したらドロップダウンを非表示
								$dropdown.hide();
							});

						});
						//ドロップダウンを表示
						$dropdown.show();
					}
				},
				error: function() {
					alert('住所の取得に失敗しました。');
				}
			});

		}

	});
});

/**
 * 住所を入力しボタンを押したら郵便番号を補完
 */
$(function() {
	//ボタンを押されたら実行
	$('#addressBtn').on('click', function() {
		//入力された住所を取得
		var address = $('#address').val();
		//ajaxでsearchPostCode()を呼び出す
		$.ajax({
			url: '/omikuji_kadai6/post/searchPostCode',
			dataType: 'json',
			data: { address: address },
			type: 'GET',
			success: function(response) {
				//取得した郵便番号が空や存在しない場合
				if (response == null || response == undefined || response == "" || response.length == 0) {
					alert('該当する郵便番号がありません。');
				} else {
					//郵便番号を補完
					$('#postCode').val(response);
				}
			},
			error: function() {
				alert('郵便番号の取得に失敗しました。');
			}
		});
	});
});


/** 
 * 住所が4文字以上入力されたら住所の候補を表示・補完
*/

$(function() {
	//文書が読み込まれたタイミングで実行
	$('#address').on('keydown', function(event) {
		var addressInput = $(this).val();
		//Enterキーを押下かつ、4文字以上入力されたら実行
		if (event.key === 'Enter' && addressInput.length >= 4) {
			//入力された住所を取得
			var address = $('#address').val();
			//ajaxでaddressCompletement()を呼び出す
			$.ajax({
				url: '/omikuji_kadai6/post/addressCompletement',
				dataType: 'json',
				data: { address: address },
				type: 'GET',
				success: function(response) {
					//ドロップダウン
					var $dropdown = $('#dropdown');
					//既存の項目をクリア
					$dropdown.empty();

					//取得した住所が空や存在しない場合
					if (response == null || response == undefined || response == "" || response.length == 0) {
						//ドロップダウンを非表示
						$('#dropdown').hide();
					} else if (response.length >= 1) {
						//1件以上ある場合
						response.forEach(function(address) {
							var $item = $('<div class="dropdown-item"></div>').text(address);
							$dropdown.append($item);
							//クリックされた候補を住所欄に補完
							$item.on('click', function() {
								$('#address').val(address);
								//補完したらドロップダウンを非表示
								$dropdown.hide();
							});
						});
						//ドロップダウンを表示
						$dropdown.show();
					}
				},
				error: function() {
					alert('入力エラー');
				}
			});
		}
	});
});
