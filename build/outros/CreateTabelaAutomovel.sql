USE [treinamento]
GO

/****** Object:  Table [dbo].[automovel]    Script Date: 03/08/2013 11:29:52 ******/
IF  EXISTS (SELECT * FROM sys.objects WHERE object_id = OBJECT_ID(N'[dbo].[automovel]') AND type in (N'U'))
DROP TABLE [dbo].[automovel]
GO

USE [treinamento]
GO

/****** Object:  Table [dbo].[automovel]    Script Date: 03/08/2013 11:29:52 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[automovel](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[marca] [nvarchar](50) NULL,
	[modelo] [nvarchar](50) NULL,
	[anoFabricacao] [int] NULL,
	[anoModelo] [int] NULL,
	[observacoes] [nvarchar](50) NULL,
 CONSTRAINT [PK_automovel] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

use Treinamento
go

exec sp_changedbowner treinamento