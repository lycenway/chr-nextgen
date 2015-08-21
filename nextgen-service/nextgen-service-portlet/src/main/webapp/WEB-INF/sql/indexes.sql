create index IX_4167D326 on base_binghai (binghaiLeixing);
create index IX_E02EBB82 on base_binghai (groupId);
create index IX_930787A on base_binghai (koufen);
create index IX_D0E3D662 on base_binghai (userId);
create index IX_282FED69 on base_binghai (visitedBy);
create index IX_2835ACF1 on base_binghai (visitedOn);

create index IX_F125DE06 on lov_binghai_pingfen (dalei, vmin, vmax, xiangmu, dengji_min, dengji_max);