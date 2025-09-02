/**
 * Ajaxを使用して郵便番号と住所の相互補完
 */
<script src="https://code.jquery.com/jquery-3.0.0.min.js"></script>


//郵便番号が7桁入力されたら住所を補完
$(function(){
	//文書が読み込まれたタイミングで実行
	$('#postCode').on('keyup', function(){
		var numLength = $(this).val().length;
		//数字7桁の変数
		var targetLength = /^\d{7}$/;
		//数字が7桁入力された場合に実行
		if(numLength === targetLength){
			//ここに実行したい処理を書く
			//入力された郵便番号を取得
			var postCode = $("#postCode").val();
			//AjaxでPostAcionのsearchAddress()を呼び出す
			$.ajax({
				url: '/omikuji6/action/PostAction/searchAddress',
				dataType: 'text',
				data: {postCode : postCode},
				type: 'Get',
				success: function(data){
					$("#xxx").val(data)
				}
			});
			
		}
	});
});