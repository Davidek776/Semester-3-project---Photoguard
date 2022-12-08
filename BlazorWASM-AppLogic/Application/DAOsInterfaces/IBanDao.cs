﻿using Domain.DTOs;

namespace Application.DAOsInterfaces;

public interface IBanDao
{
	Task<long> CreateAsync(BanCreationDto dto);
}
